package orm.utilsDB;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//classe responsável pelo DDL -> Data Defition Language
public class GeraTabelaAluno {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		factory.close();
	}

}
