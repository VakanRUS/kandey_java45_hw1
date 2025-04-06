public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Task 1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        //task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Task 2");
        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);
        System.out.println();

        //task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Task 3");
        System.out.println("dog - 3.5 = " + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper);
        System.out.println();

        //task 4
        var friend = 19;
        System.out.println("Task 4");
        System.out.println("friend = " + friend);
        friend = (friend + 2);
        System.out.println("friend + 2 =  " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 =  " + friend);
        System.out.println();

        //task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
        System.out.println();

        //task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;
        System.out.println("Task 6");
        System.out.println("Total weight of boxers = " + totalWeight + "kg");
        System.out.println("Weight difference of boxers = " + weightDifference + "kg");
        System.out.println();

        //task 7
        var remainder = boxer2 % boxer1;
        System.out.println("Task 7");
        System.out.println("remainder of the division = " + remainder + "kg");
        System.out.println();

        //task 8
        var totalTime = 640;
        var employees = totalTime / 6;
        System.out.println("Task 8");
        System.out.println("Всего работников в компании " + employees + " человек");
        employees = employees + 94;
        totalTime = employees * 6;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }
}