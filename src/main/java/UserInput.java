import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserInput {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Something");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);

        if(!StringUtils.isNumeric(input)){
            System.out.println(input + " is not a number");

        }else {
            System.out.println(input + " is a number");
        }

        System.out.println(StringUtils.swapCase(input));
        System.out.println(StringUtils.reverse(input));

///////////////////BONUS//////////////////////////////////////////////////////////////

        Faker faker = new Faker();

        String name = faker.name().fullName();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        String streetAddress = faker.address().streetAddress();

        String funnyName = faker.funnyName().name();
        String rockBand = faker.rockBand().name();
        String morty = faker.rickAndMorty().quote();

        System.out.println(name);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(streetAddress);
        System.out.println(funnyName);
        System.out.println(rockBand);
        System.out.println(morty);



    }



}
