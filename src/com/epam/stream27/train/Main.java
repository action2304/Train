package com.epam.stream27.train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Train train = new Train();
        PassengerCoach pc = new PassengerCoach();
        FreightCoach fc = new FreightCoach();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Specify the power of the train(horsepower):");
        train.setPower(Integer.parseInt((bufferedReader.readLine())));

        System.out.println("How much power is spent on one passenger coach(horsepower):");
        pc.setPowerForOnePassengerCoach(Integer.parseInt(bufferedReader.readLine()));

        System.out.println("How much power is spent on one freight coach(horsepower):");
        fc.setPowerForOneFreightCoach(Integer.parseInt(bufferedReader.readLine()));

        System.out.println("Electric train can pull:");
        System.out.println("Passenger coach: " + (train.getPower() / pc.getPowerForOnePassengerCoach()));
        System.out.println("Freight coach: " + (train.getPower() / fc.getPowerForOneFreightCoach()));
    }
}

//    Мощность у ВЛ10у в часовом режиме 7100 л. с. на скорости 48 км/ч, 5100-5200 л. с. на 100км/ч.
//    Самый мощный грузовой электровоз (из отечественных) ВЛ86ф, около 15 500л. с. (11 400кВт)
