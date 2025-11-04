package ed.Unidade2.pilha.exercicio_carro.dao;
import ed.Unidade2.pilha.Stackable;
import ed.Unidade2.pilha.exercicio_carro.dao.CarDaoLinkedStack;
import ed.Unidade2.pilha.exercicio_carro.dao.CarDAO;
import ed.Unidade2.pilha.exercicio_carro.model.Car;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        CarDaoLinkedStack stackCar = new CarDaoLinkedStack();

        Car c1 = new Car("1234", "Ford", "Ka", "Verde", "José", LocalDateTime.now());
        stackCar.addCar(c1);

        Car c2 = new Car("1445", "Volkswagen", "Fusca", "Azul","João", LocalDateTime.now());
        stackCar.addCar(c2);

        Car c3 = new Car("3333", "Chevrolet", "Onix", "Preto","Gabriel", LocalDateTime.now());
        stackCar.addCar(c3);


        System.out.println(stackCar.printCars());
        System.out.println(stackCar.getTotalCars());

        stackCar.removeCarsByOwner("Gabriel");

        System.out.println(stackCar.printCars());
    }
}
