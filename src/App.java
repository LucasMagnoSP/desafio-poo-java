import java.time.LocalDate;

import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
     
    Curso curso = new Curso();
    curso.setTitulo("JAVA");
    curso.setDescricao("DESCRIÇAO JAVA");
    curso.setCargaHoraria(10);

    Curso curso1 = new Curso();
    curso1.setTitulo("JAVASCRIPIT");
    curso1.setDescricao("DESCRIÇAO JAVASCRIPT");
    curso1.setCargaHoraria(10);

    Mentoria mentoria = new Mentoria();
    mentoria.setDescricao("descricao mentoria");
    mentoria.setTitulo("Mentoria");
    mentoria.setData(LocalDate.now());

    System.out.println(curso.getDescricao() +" "+curso.getCargaHoraria() +" "+ curso.getTitulo());
    System.out.println(curso1.getDescricao() +" "+curso1.getCargaHoraria() +" "+ curso1.getTitulo());
    System.out.println(mentoria.getDescricao() +" "+mentoria.getData() +" "+ mentoria.getTitulo());

    }
}
