package proyecto;
import java.util.Date;
public class PoderNotarial {
	
	private int id_poderN;
	private int numControl;
	private Date fecExp;
	private int numInstru;
	private int numNotario;
	private String notario;
	private String tipoPoder;
	private String caseFile;
	private String entity;
	private String representante;
	private String cargo;
	private String ruta_pdf;
	
	public PoderNotarial(int id_poderN, int numControl, Date fecExp, int numInstru, int numNotario, String notario,
			String tipoPoder, String caseFile, String entity, String representante, String cargo, String ruta_pdf) {
		this.id_poderN = id_poderN;
		this.numControl = numControl;
		this.fecExp = fecExp;
		this.numInstru = numInstru;
		this.numNotario = numNotario;
		this.notario = notario;
		this.tipoPoder = tipoPoder;
		this.caseFile = caseFile;
		this.entity = entity;
		this.representante = representante;
		this.cargo = cargo;
		this.ruta_pdf = ruta_pdf;
	}
	
	public PoderNotarial() {
		
		this.id_poderN = 1;
		this.numControl = 10;
		this.fecExp = new Date();
		this.numInstru = 15;
		this.numNotario = 10;
		this.notario = "Ricardo Franco Kholer";
		this.tipoPoder = "Epecial";
		this.caseFile = "Copia Certificada";
		this.entity = "Aguascalientes";
		this.representante = "Guadalupe Mateos Ortis";
		this.cargo = cargo;
		this.ruta_pdf = "poderPDF/CopiaCertificada";
	}
	public int getId_poderN() {
		return id_poderN;
	}
	public void setId_poderN(int id_poderN) {
		this.id_poderN = id_poderN;
	}
	public int getNumControl() {
		return numControl;
	}
	public void setNumControl(int numControl) {
		this.numControl = numControl;
	}
	public Date getFecExp() {
		return fecExp;
	}
	public void setFecExp(Date fecExp) {
		this.fecExp = fecExp;
	}
	public int getNumInstru() {
		return numInstru;
	}
	public void setNumInstru(int numInstru) {
		this.numInstru = numInstru;
	}
	public int getNumNotario() {
		return numNotario;
	}
	public void setNumNotario(int numNotario) {
		this.numNotario = numNotario;
	}
	public String getNotario() {
		return notario;
	}
	public void setNotario(String notario) {
		this.notario = notario;
	}
	public String getTipoPoder() {
		return tipoPoder;
	}
	public void setTipoPoder(String tipoPoder) {
		this.tipoPoder = tipoPoder;
	}
	public String getCaseFile() {
		return caseFile;
	}
	public void setCaseFile(String caseFile) {
		this.caseFile = caseFile;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getRuta_pdf() {
		return ruta_pdf;
	}
	public void setRuta_pdf(String ruta_pdf) {
		this.ruta_pdf = ruta_pdf;
	}
	public String toString() {
		return "PoderNotarial [id_poderN=" + id_poderN + ", numControl=" + numControl + ", fecExp=" + fecExp
				+ ", numInstru=" + numInstru + ", numNotario=" + numNotario + ", notario=" + notario + ", tipoPoder="
				+ tipoPoder + ", caseFile=" + caseFile + ", entity=" + entity + ", representante=" + representante
				+ ", cargo=" + cargo + ", ruta_pdf=" + ruta_pdf + "]";
	}
	public boolean equals( Object otro) {
		boolean valorRetorno = true;
		if(this == otro)
		{
			valorRetorno = true;
		}
		else if(otro == null)
		{
			valorRetorno = false;
		}
		else 
		{
			if (this.getClass() != otro.getClass())
			{
				valorRetorno = false;
			}
			else
			{
				//Ya se pueden comparar atributo por atributo 
				PoderNotarial nuevaPoderNotarial = (PoderNotarial) otro; //Instancia una casa
				if(this.getId_poderN() == nuevaPoderNotarial.getId_poderN())
				{
					valorRetorno = true;
				}
				else
				{
					valorRetorno = false;
				}
				
			}
		}
		return valorRetorno;
	}
	public boolean capturaRegistro ( String captura)
	{
		MongoDBDatabase basedatos = new MongoDBDatabase();
		basedatos.connect("sicopon");
		basedatos.insert("query");
		basedatos.disconnect();
		return true; //En caso de una captura exitosa
	}
	public boolean buscarRegistro( String consulta )
	{
		MongoDBDatabase basedatos = new MongoDBDatabase();
		basedatos.connect("sicopon");
		basedatos.consulta("query");
		basedatos.disconnect();
		return true; //En caso de una busqueda exitosa
	}
	public boolean borrarRegistro( String consulta )
	{
		MongoDBDatabase basedatos = new MongoDBDatabase();
		basedatos.connect("sicopon");
		basedatos.delete("query");
		basedatos.disconnect();
		return true; //En caso de un borrado exitoso
	}
	public boolean ActualizarRegistro( String consulta )
	{
		MongoDBDatabase basedatos = new MongoDBDatabase();
		basedatos.connect("sicopon");
		basedatos.update("query");
		basedatos.disconnect();
		return true; //En caso de una actualizacion exitosa
	}

}
