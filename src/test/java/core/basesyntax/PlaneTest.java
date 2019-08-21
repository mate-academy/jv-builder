package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class PlaneTest {
    @Test
    public void checkCountOfPrivateFields() {
        List<Field> privateFields = new ArrayList<>();
        List<Field> allFields = Arrays.asList(Plane.class.getDeclaredFields());
        for (Field field : allFields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                privateFields.add(field);
            }
        }

        Assert.assertEquals("You should have private fields only!", allFields.size(), privateFields.size());
        Assert.assertTrue("You should have at least 5 fields", privateFields.size() >= 5);
    }

    @Test
    public void checkThatBuilderClassIsPresent() {
        List<Class> planeInnerClasses = Arrays.asList(Plane.class.getClasses());
        Assert.assertFalse("PlaneBuilder class should be present as inner class", planeInnerClasses.isEmpty());
        Optional<Class> planeBuilderClass = planeInnerClasses.stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getSimpleName().equals("PlaneBuilder"))
                .findFirst();
        Assert.assertTrue("PlaneBuilder class should be present", planeBuilderClass.isPresent());

        try {
            planeBuilderClass.get().getMethod("build");
        } catch (NoSuchMethodException e) {
            Assert.fail("Builder class should contain method 'build'");
        }
    }


    @Test
    public void checkThatBuildMethodIsNotPresentInMainClass() {
        try {
            Plane.class.getMethod("build");
        } catch (NoSuchMethodException e) {
            return;
        }
        Assert.fail("Method 'build' should not be present in the Plane.class");
    }

    @Test
    public void checkThatAllFieldsFromPlaneExistsInBuilderAsSetters() {
        List<Field> planeFields = Arrays.asList(Plane.class.getDeclaredFields());

        List<Class> planeInnerClasses = Arrays.asList(Plane.class.getClasses());
        Optional<Class> planeBuilderClass = planeInnerClasses.stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getSimpleName().equals("PlaneBuilder"))
                .findFirst();
        Assert.assertTrue("PlaneBuilder class should be present", planeBuilderClass.isPresent());


        List<Method> builderMethods = Arrays.asList(planeBuilderClass.get().getMethods());
        for (Field f : planeFields) {
            String fieldName = f.getName();
            builderMethods.stream()
                    .filter(m -> m.getName().equalsIgnoreCase("set" + fieldName))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Setter for " + fieldName + " should be present in builder"));
        }

    }
}