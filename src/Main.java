import java.util.Arrays;

public class Main {

public static void main ( String[] args) {

var dog = 8.0 ;

var cat = 3.6 ;

var paper = 763789;

    System.out.println("Задача № 1") ;

    System.out.println(dog);

    System.out.println(cat);

    System.out.println(paper);

    dog = dog + 4 ;

    cat = cat + 4 ;

    paper = paper + 4 ;

    System.out.println("Задача № 2") ;

    System.out.println(dog);

    System.out.println(cat);

    System.out.println(paper);

    dog = dog - 3.5 ;

    cat = cat - 1.6 ;

    paper = paper - 7639 ;

    System.out.println("Задача № 3") ;

    System.out.println(dog);

    System.out.println(cat);

    System.out.println(paper);

    System.out.println("Задача № 4");

    var friend = 19 ;

    System.out.println(friend);

    friend = friend + 2 ;

    System.out.println(friend);

    friend = friend / 7 ;

    System.out.println(friend);

    System.out.println("Задача № 5");

    var frog = 3.5;

    System.out.println(frog);

    frog = frog * 10 ;

    System.out.println(frog);

    frog = frog / 3.5 ;

    System.out.println(frog);

    frog = frog + 4 ;

    System.out.println(frog);

    System.out.println("Задача № 6");

    var FirstBoxer = 78.2 ;

    var SecondBoxer =  82.7 ;

    var TotalWeight = FirstBoxer + SecondBoxer ;

    System.out.println("Общий вес бойцов " + TotalWeight + "кг");

    var RaznicaVVese = SecondBoxer / FirstBoxer ;

    System.out.println("Разница в весе бойцов "+ RaznicaVVese + "кг");

    System.out.println("Задача № 7");

    var OstatokDeleniya =SecondBoxer % FirstBoxer ;

    System.out.println("остаток от деления между двумя весами " + OstatokDeleniya + "кг");

    System.out.println("Задача № 8");

    var allTime = 640 ;

    var JobForOne = 8 ;

    var countWorkers = allTime / JobForOne ;

    System.out.println("Всего работников в компании — " + countWorkers + " человек");

    countWorkers = countWorkers + 94 ;

    JobForOne = allTime / countWorkers ;

    System.out.println("Если в компании работает — " + countWorkers + " человек, " + " то всего "+ JobForOne + " часов работы может быть поделено между сотрудниками");

}
}

