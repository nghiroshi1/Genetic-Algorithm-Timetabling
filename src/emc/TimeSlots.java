package emc;

import java.util.Date;

import entr_saida.Arquivo;



/**
 * Class TimeSlots
 */
public class TimeSlots {

  //
  // Fields
  //

  /**
   * Um numero natural maior que zero que indentifica de forma unica timeslot. 7) das 7h as 7h59min, 8) das 8h as 8h59min
   */
  private int codigo;
  private String hora;
  Date date;
  /**
   * 1-domingo, 2-segunda, 3-terça, 4-quarta, 5-quinta e 6-sexta
   */
  private int codDiaSemana;
  
  //
  // Constructors
  //
  public TimeSlots () { };
  public TimeSlots (int codigo, int codDiaSemana, String horaIncioFim) { 
	  this.codigo=codigo;
	  this.codDiaSemana=codDiaSemana;
	  this.hora=horaIncioFim;

	  
  };
  
  //
  // Methods
  //

	/**
	 * 
	 * @param timeSlots
	 * @param codigoTimeSlot
	 * @return
 	 * <h2>Descrição</h2>
 	 * <p>Retorna qual timeSlots tem aquele codigo (codigoTimesSlots) de uma array list de timeSlots</p>
	 * <p>caso o codigo não pertença a nenhum timeSlost do array passado por parametro então retorna null</p>
 */
  public static TimeSlots qualTimeSlot(int codigoTimeSlot){
		for (int i = 0; i < Arquivo.listaTimeSlots.size(); i++) {
			if(Arquivo.listaTimeSlots.get(i).codigo == codigoTimeSlot){
				return Arquivo.listaTimeSlots.get(i);
			}
		}
		return null;
  }



  //
  // Accessor methods
  //
  
  /**
   * Set the value of codigo
   * Um numero natural maior que zero que indentifica de forma unica timeslot. 7) das
   * 7h as 7h59min, 8) das 8h as 8h59min
   * @param newVar the new value of codigo
   */
  public void setCodigo (int codigo) {
    this.codigo = codigo;
  }

  /**
   * Get the value of codigo
   * Um numero natural maior que zero que indentifica de forma unica timeslot. 7) das
   * 7h as 7h59min, 8) das 8h as 8h59min
   * @return the value of codigo
   */
  public int getCodigo () {
    return codigo;
  }

  /**
   * Set the value of codDiaSemana
   * 1-domingo, 2-segunda, 3-terça, 4-quarta, 5-quinta e 6-sexta
   * @param newVar the new value of codDiaSemana
   */
  public void setCodDiaSemana (int codDiaSemana) {
    this.codDiaSemana = codDiaSemana;
  }

  /**
   * Get the value of codDiaSemana
   * 1-domingo, 2-segunda, 3-terça, 4-quarta, 5-quinta e 6-sexta
   * @return the value of codDiaSemana
   */
  public int getCodDiaSemana () {
    return codDiaSemana;
  }
public String getHora() {
	return hora;
}
public void setHora(String data) {
	this.hora = data;
}

  //
  // Other methods
  //

}
