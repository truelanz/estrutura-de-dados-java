import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * <p> {@code Map} Interface:
 * <p> <a href="https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/HashMap.html">Map doc</a>
 * 
 * <p> {@code HashMap} class:
 * <p> <a href="https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/HashMap.html">HashMap doc</a>
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Cleber");
        aluno.put("Idade", "15");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "2ºB");

        System.out.println("---\n" + aluno);
        
        //keySet - Mostra a primeira entrada do map: As keys...
        System.out.println("---\n" + aluno.keySet());

        //values: Mostra o "valor" contindo em cada key, respectivamente;
        System.out.println("---\n" + aluno.values());

        //------CRIANDO LIST DE ARRAY QUE COMPORTE OS "map alunos";
        List<Map<String, String>> listaAlunos = new ArrayList<>();

        Map<String, String> aluno2 = new HashMap<>();

        //adicionando Map alunos à List ArrayList;
        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        aluno2.put("Nome", "Retana");
        aluno2.put("Idade", "16");
        aluno2.put("Media", "9.3");
        aluno2.put("Turma", "3ºA");

        System.out.println("---\n" + listaAlunos);

        //containsKey
        System.out.println("---\n" + aluno2.containsKey("Renata"));
    }
}
