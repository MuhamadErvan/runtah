import java.util.List;
public class list{
    public static void main(String[] args){
    List<String> languages = List.of("Java", "C++", "C", "Go", "PHP");

    languages.stream()
    .forEach(System.out::println);
    }
}
