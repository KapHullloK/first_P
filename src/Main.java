import java.lang.Math;


public class Main {
    public static void main(String[] args) {

        var dog = 8.;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("-------------");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog *= 3.5;
        cat *= 1.6;
        paper *= 7639;

        System.out.println("-------------");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("-------------");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("------------");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println("------------");
        var firstMan = 78.2;
        var secondMan = 82.7;
        System.out.println(firstMan + secondMan);
        System.out.println(Math.abs(firstMan - secondMan));

        System.out.println("------------");
        System.out.println(11 % 7);

        System.out.println("------------");
        var time = 640;
        var timePerWorker = 8;
        var amountWorkers = time / timePerWorker;
        System.out.println("Всего работников в компании — " + amountWorkers + " человек");

        var newWorkers = amountWorkers + 94;
        var newTime = newWorkers * timePerWorker;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");

    }
}