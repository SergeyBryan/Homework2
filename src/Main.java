public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println("Friend равен"+ " " + friend);
        friend = friend * 2;
        System.out.println("Friend после умножения на 2 равен"+ " " + friend);
        friend = friend / 7;
        System.out.println("Friend после деления на 7 равен"+ " " + friend);
        var frog = 3.5;
        System.out.println("Frog равен"+ " " + frog);
        frog = frog * 10;
        System.out.println("Frog после умножения на 10 равен"+ " " + frog);
        frog = frog / 3.5;
        System.out.println("Frog после деления на 3.5 равен"+ " " + frog);
        frog = frog + 4;
        System.out.println("Frog после сложения на 4 равен"+ " " + frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalBoxerweight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов " + totalBoxerweight);
        var difBoxerweight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе двух боксеров " + difBoxerweight);
        var difBoxerweight2 = secondBoxer % firstBoxer;
        System.out.println("Разница в весе двух боксеров с помощью функции остаток от деления равна "+ difBoxerweight2);
        var totalHour = 640;
        var workday = 8;
        var totalEmploye = totalHour/workday;
        System.out.println("Всего работников в компании " + totalEmploye + " человек");
        var totalEmployeNew = totalEmploye + 94;
        var totalHourNew = totalEmployeNew * workday;
        System.out.println("Если в компании работает " + totalEmployeNew + " человек, то всего " + totalHourNew + " часов работы может быть поделено между сотрудниками");

    }
}