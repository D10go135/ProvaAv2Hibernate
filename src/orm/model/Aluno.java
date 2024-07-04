package orm.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alunos")
public class Aluno {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String email;
	    private String cpf;

	    @Column(name = "data_nascimento")
	    private LocalDate dataNascimento;

	    private String naturalidade;
	    private String endereco;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public LocalDate getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getNaturalidade() {
			return naturalidade;
		}
		public void setNaturalidade(String naturalidade) {
			this.naturalidade = naturalidade;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

	    // Getters e Setters
	

}

