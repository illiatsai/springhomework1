package by.tsai2.ilya2.springhomework;

import by.tsai2.ilya2.springhomework.bean.Tour;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Tour tour = context.getBean("myBelarusTour", Tour.class);
        Tour tourTwo = context.getBean("myNitherlandsTour", Tour.class);

        //call methods on the bean
        tour.showTour();
        tourTwo.showTour();

        //close the context
        context.close();
    }
}

//продумать сервисы и дао для сайта турфирмы
//и внедрить зависимости с помощью платформы Spring
