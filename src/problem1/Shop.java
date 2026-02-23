package problem1;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<Item>();

        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        String keepShopping = "y";

        try (Scanner scan = new Scanner(System.in))
        {
            do
            {
                System.out.print("Enter the name of the item: ");
                itemName = scan.nextLine();

                System.out.print("Enter the unit price: ");
                itemPrice = scan.nextDouble();

                System.out.print("Enter the quantity: ");
                quantity = scan.nextInt();
                scan.nextLine();

                item = new Item(itemName, itemPrice, quantity);
                cart.add(item);

                double totalPrice = 0.0;

                System.out.println("\nShopping Cart:");
                System.out.println("Item\tPrice\tQuantity\tTotal");

                for (int i = 0; i < cart.size(); i++)
                {
                    Item currentItem = cart.get(i);
                    System.out.println(currentItem);

                    totalPrice += currentItem.getPrice() * currentItem.getQuantity();
                }

                System.out.println("Total Price: " + totalPrice);
                System.out.println();

                System.out.print("Continue shopping (y/n)? ");
                keepShopping = scan.nextLine();


            } while (keepShopping.equals("y"));
        }
    }
}
