package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;

public class BuscaAlunoPorLetra {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        
        String sql = "Select a from Aluno as a where a.nome like :paramNome";
        
        // JPQL: Classe Query de "javax.persistence"
        Query query = manager.createQuery(sql);
        query.setParameter("paramNome", "D%");  // Substitua "J%" pela letra desejada
        
        // Mostrando o resultado
        List<Aluno> listaAlunos = query.getResultList();
        
        for (Aluno aluno : listaAlunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
            System.out.println("Naturalidade: " + aluno.getNaturalidade());
            System.out.println("Endereço: " + aluno.getEndereco());
            System.out.println("---------------");
        }
        
        manager.close();
        factory.close();
    }
}
