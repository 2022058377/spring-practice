package spring_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_practice.config.Config;
import spring_practice.logic.JavaSort;
import spring_practice.logic.Sort;
import spring_practice.service.SortService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("{result} " + sortService.doSort(Arrays.asList(args)));
    }
}