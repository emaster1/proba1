public class Tekst{
public static void main(String[] args){
String imie = "Emilka";
String nazwisko = "Sterna";
System.out.println("Imie i nazwisko: " + imie+" "+nazwisko);
String zlozenie = imie.substring(4,6)+nazwisko.substring(3,4)+nazwisko.substring(5,6);
System.out.println(zlozenie);
System.out.println(imie.substring(4,6)+nazwisko.substring(3,4)+nazwisko.substring(5,6));
}
}