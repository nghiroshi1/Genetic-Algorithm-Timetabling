package emc;

import java.util.ArrayList;

import entr_saida.Arquivo;

/**
 * Class Disciplina
 */
public class Disciplina {

	//
	// Fields
	//

	private ArrayList<Integer> slotObr = new ArrayList<>();
	/**
	 * e o codigo – um numero natural maior que zero – que identifica de maneira
	 * unica disciplina. Portanto nao ha´ duas disciplinas com o mesmo codigo; 
	 */
	private int codigo;
	private int numDisciplina;
	/**
	 * expressa a carga horaria semanal, em numero de horas, das aulas teoricas
	 * da disciplina. Se nao houver aulas teoricas, então deve valer 0 (zero);
	 */
	private int cargaHorariaTeorica;
	private Professor professor;
	private ArrayList<Estudante> turma;
	/**
	 * e o codigo – um numero natural maior que zero – do curso ao qual a
	 * disciplina está vinculada. Uma disciplina somente pode estar vinculada a
	 * um unico curso. 
	 */
	private int codigoCurso;
	/**
	 * é uma cadeia de caracteres que descreve o nome oficial da disciplina; 
	 */
	private String descricao;
	/**
	 * expressa a carga horaria semanal, em numero de horas, das aulas praticas
	 * da disciplina. Se nao houver aulas praticas, então deve valer 0 (zero); 
	 */
	private int cargaHorariaPratica;
	/**
	 * define qual o tipo de sala de aula é necessário para acomodar as aulas
	 * teóricas da disciplina 
	 */
	private int tipoSalaPratica;
	private int tipoSalaTeoria;
	private int codigPeriodo;

	//
	// Constructors
	//

	public Disciplina(int codigo, int codigoCurso, int codigoPeriodo, String descricao,
			int cargaHorariaTeoria, int tipoSalaTeoria,
			int cargaHorariaPratica, int tipoSalaPratica) {
			this.codigo=codigo;
			this.codigoCurso=codigoCurso;
			this.setCodigPeriodo(codigoPeriodo);
			this.descricao = descricao;
			this.cargaHorariaTeorica=cargaHorariaTeoria;
			this.tipoSalaTeoria = tipoSalaTeoria;
			this.cargaHorariaPratica = cargaHorariaPratica;
			this.tipoSalaPratica=tipoSalaPratica;
			
			
	};

	//
	// Methods
	//
	/**
	 * 
	 * @param disciplinas
	 * @param codigoDisciplina
	 * @returnn Curso
	 * 	 * <h2>Descrição</h2>
	 * <p>Retorna qual disciplina tem aquele codigo (codigoDisciplina) de uma array list de disciplina</p>
	 * <p>caso o codigo não pertença a nenhuma disciplina do array passado por parametro então retorna null</p>
	 */
	public static Disciplina qualDisciplina( int codigoDisciplina){
		for (int i = 0; i < Arquivo.disciplinasEMC.size(); i++) {
			if(Arquivo.disciplinasEMC.get(i).codigo==codigoDisciplina){
				return Arquivo.disciplinasEMC.get(i);
			}
		}
		return null;
	}
	//
	// Accessor methods
	//

	/**
	 * Set the value of codigo e o codigo – um numero natural maior que zero –
	 * que identifica de maneira unica disciplina. Portanto nao ha´ duas
	 * disciplinas com o mesmo codigo; 
	 * 
	 * @param newVar
	 *            the new value of codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Get the value of codigo e o codigo – um numero natural maior que zero –
	 * que identifica de maneira unica disciplina. Portanto nao ha´ duas
	 * disciplinas com o mesmo codigo; 
	 * 
	 * @return the value of codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Set the value of numDisciplina
	 * 
	 * @param newVar
	 *            the new value of numDisciplina
	 */
	public void setNumDisciplina(int numDisciplina) {
		this.numDisciplina = numDisciplina;
	}

	/**
	 * Get the value of numDisciplina
	 * 
	 * @return the value of numDisciplina
	 */
	public int getNumDisciplina() {
		return numDisciplina;
	}

	/**
	 * Set the value of cargaHorariaTeorica expressa a carga horaria semanal, em
	 * numero de horas, das aulas teoricas da disciplina. Se nao houver aulas
	 * teoricas, então deve valer 0 (zero);
	 * 
	 * @param newVar
	 *            the new value of cargaHorariaTeorica
	 */
	public void setCargaHorariaTeorica(int cargaHorariaTeorica) {
		this.cargaHorariaTeorica = cargaHorariaTeorica;
	}

	/**
	 * Get the value of cargaHorariaTeorica expressa a carga horaria semanal, em
	 * numero de horas, das aulas teoricas da disciplina. Se nao houver aulas
	 * teoricas, então deve valer 0 (zero);
	 * 
	 * @return the value of cargaHorariaTeorica
	 */
	public int getCargaHorariaTeorica() {
		return cargaHorariaTeorica;
	}

	/**
	 * Set the value of professor
	 * 
	 * @param newVar
	 *            the new value of professor
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/**
	 * Get the value of professor
	 * 
	 * @return the value of professor
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * Set the value of alunosMat
	 * 
	 * @param newVar
	 *            the new value of alunosMat
	 */
	public void setAlunosMat(ArrayList<Estudante> alunosMat) {
		this.turma = alunosMat;
	}

	/**
	 * Get the value of alunosMat
	 * 
	 * @return the value of alunosMat
	 */
	public ArrayList<Estudante> getAlunosMat() {
		return turma;
	}

	/**
	 * Set the value of codigoCurso e o codigo – um numero natural maior que
	 * zero – do curso ao qual a disciplina está vinculada. Uma disciplina
	 * somente pode estar vinculada a um unico curso. 
	 * 
	 * @param newVar
	 *            the new value of codigoCurso
	 */
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	/**
	 * Get the value of codigoCurso e o codigo – um numero natural maior que
	 * zero – do curso ao qual a disciplina está vinculada. Uma disciplina
	 * somente pode estar vinculada a um unico curso. 
	 * 
	 * @return the value of codigoCurso
	 */
	public int getCodigoCurso() {
		return codigoCurso;
	}

	/**
	 * Set the value of descricao é uma cadeia de caracteres que descreve o nome
	 * oficial da disciplina; 
	 * 
	 * @param newVar
	 *            the new value of descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Get the value of descricao é uma cadeia de caracteres que descreve o nome
	 * oficial da disciplina; 
	 * 
	 * @return the value of descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Set the value of cargaHorariaPratica expressa a carga horaria semanal, em
	 * numero de horas, das aulas praticas da disciplina. Se nao houver aulas
	 * praticas, então deve valer 0 (zero); 
	 * 
	 * @param newVar
	 *            the new value of cargaHorariaPratica
	 */
	public void setCargaHorariaPratica(int newVar) {
		cargaHorariaPratica = newVar;
	}

	/**
	 * Get the value of cargaHorariaPratica expressa a carga horaria semanal, em
	 * numero de horas, das aulas praticas da disciplina. Se nao houver aulas
	 * praticas, então deve valer 0 (zero); 
	 * 
	 * @return the value of cargaHorariaPratica
	 */
	public int getCargaHorariaPratica() {
		return cargaHorariaPratica;
	}

	/**
	 * Set the value of tipoSalaPratica define qual o tipo de sala de aula é
	 * necessário para acomodar as aulas teóricas da disciplina 
	 * 
	 * @param newVar
	 *            the new value of tipoSalaPratica
	 */
	public void setTipoSalaPratica(int tipoSalaPratica) {
		this.tipoSalaPratica = tipoSalaPratica;
	}

	/**
	 * Get the value of tipoSalaPratica define qual o tipo de sala de aula é
	 * necessário para acomodar as aulas teóricas da disciplina 
	 * 
	 * @return the value of tipoSalaPratica
	 */
	public int getTipoSalaPratica() {
		return tipoSalaPratica;
	}

	public int getTipoSalaTeoria() {
		return tipoSalaTeoria;
	}

	public void setTipoSalaTeoria(int tipoSalaTeoria) {
		this.tipoSalaTeoria = tipoSalaTeoria;
	}

	public int getCodigPeriodo() {
		return codigPeriodo;
	}

	public void setCodigPeriodo(int codigPeriodo) {
		this.codigPeriodo = codigPeriodo;
	}

	public ArrayList<Integer> getSlotObr() {
		return slotObr;
	}

	public void setSlotObr(ArrayList<Integer> slotObr) {
		this.slotObr = slotObr;
	}

	//
	// Other methods
	//

}
