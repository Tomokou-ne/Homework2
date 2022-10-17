public class Main {
    public static void main(String[] args) {
// Задание 1-3
        System.out.println("Задание 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
// Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
// Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//Задание 6
        System.out.println("Задание 6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Суммарный вес " + totalWeight);
        var differenceWeight = boxerTwo - boxerOne;
        System.out.println("Разница между весами " + differenceWeight);
//Задание 7
        System.out.println("Задание 7");
        var differenceWeightOne = boxerTwo - boxerOne;
        System.out.println("Разница между весами(1) " + differenceWeightOne);
        var differenceWeightTwo = boxerTwo % boxerOne;
        System.out.println("Разница между весами(2) " + differenceWeightTwo);

        System.out.println("Задание 8");
        var totalWorkTime = 640;
        var oneEmployee = 8;
        var totalEmployee = totalWorkTime / oneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployee + " человек.");
        totalEmployee = totalEmployee + 94;
        oneEmployee = totalWorkTime / totalEmployee;
        System.out.println("Если в компании работает " + totalEmployee + " человек, то всего " + oneEmployee + " часов работы может быть поделено между сотрудниками.");
    }

    }
