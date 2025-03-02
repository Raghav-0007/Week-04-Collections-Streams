package reflection.intermediatelevel.retrieveannotationsatruntime;

import java.lang.reflect.AnnotatedArrayType;
import java.text.Annotation;

public class Main {
    public static void main(String[] args) {
        try {
            // get the class
            Class<?> obj = Class.forName("reflection.intermediatelevel.retrieveannotationsatruntime.Myclass2");

            // check if the annotation is present or not
            if(obj.isAnnotationPresent(Author.class)){
                Author author= obj.getAnnotation(Author.class);
                System.out.println(author.name());
            }else {
                System.out.println("annotation not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
