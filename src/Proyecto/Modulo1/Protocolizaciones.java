package Proyecto.Modulo1;
import java.util.Date;
public class Protocolizaciones {

	public Protocolizaciones(int id_proto, int numControlP, int numInstruP, int numNotario, String notarioP,
			String caseFileP, String entityP, String otorgante, String cargoP, String ruta_pdfproto, Date fechaExpP) {
		this.id_proto = id_proto;
		this.numControlP = numControlP;
		this.numInstruP = numInstruP;
		this.numNotario = numNotario;
		this.notarioP = notarioP;
		this.caseFileP = caseFileP;
		this.entityP = entityP;
		this.otorgante = otorgante;
		this.cargoP = cargoP;
		this.ruta_pdfproto = ruta_pdfproto;
		this.fechaExpP = fechaExpP;
	}
	private int id_proto;
	private int numControlP;
	private int numInstruP;
	private int numNotario;
	private String notarioP;
	private String caseFileP;
	private String entityP;
	private String otorgante;
	private String cargoP;
	private String ruta_pdfproto;
	private Date fechaExpP;
	/*Constructor de la clase*/
	public Protocolizaciones( ) 
	{
		this.id_proto = 1;
		this.numControlP = 12;
		this.fechaExpP = new Date();
		this.numInstruP = 52;
		this.numNotario = 154;
		this.notarioP = "Ricardo Franco Kholer";
		this.caseFileP = "Copia Certificada";
		this.entityP = "CDMX";
		this.otorgante =  "Alejandro Rafael Cravioto Quintana";
		this.cargoP = "Director";
		this.ruta_pdfproto = "protoPDF/CopiaCertificada";
	}
	public int getId_proto() {
		return id_proto;
	}
	public void setId_proto(int id_proto) {
		if(id_proto > 0)
		{
			this.id_proto = id_proto;
		}
	}
	public int getNumControlP() {
		return numControlP;
	}
	public void setNumControlP(int numControlP) {
		if(numControlP > 0 )
		{
			this.numControlP = numControlP;
		}
	}
	public Date getFechaExpP() {
		return fechaExpP;
	}
	public void setFechaExpP(Date fechaExpP) {
		this.fechaExpP = fechaExpP;
	}
	public int getNumInstruP() {
		return numInstruP;
	}
	public void setNumInstruP(int numInstruP) {
		this.numInstruP = numInstruP;
	}
	public int getNumNotario() {
		return numNotario;
	}
	public void setNumNotario(int numNotario) {
		this.numNotario = numNotario;
	}
	public String getNotarioP() {
		return notarioP;
	}
	public void setNotarioP(String notarioP) {
		this.notarioP = notarioP;
	}
	public String getCaseFileP() {
		return caseFileP;
	}
	public void setCaseFileP(String caseFileP) {
		this.caseFileP = caseFileP;
	}
	public String getEntityP() {
		return entityP;
	}
	public void setEntityP(String entityP) {
		this.entityP = entityP;
	}
	public String getOtorgante() {
		return otorgante;
	}
	public void setOtorgante(String otorgante) {
		this.otorgante = otorgante;
	}
	public String getCargoP() {
		return cargoP;
	}
	public void setCargoP(String cargoP) {
		this.cargoP = cargoP;
	}
	public String getRuta_pdfproto() {
		return ruta_pdfproto;
	}
	public void setRuta_pdfproto(String ruta_pdfproto) {
		this.ruta_pdfproto = ruta_pdfproto;
	}
	public String toString() {
		return "Protocolizaciones [id_proto=" + id_proto + ", numControlP=" + numControlP + ", fechaExpP=" + fechaExpP
				+ ", numInstruP=" + numInstruP + ", numNotario=" + numNotario + ", notarioP=" + notarioP
				+ ", caseFileP=" + caseFileP + ", entityP=" + entityP + ", otorgante=" + otorgante + ", cargoP="
				+ cargoP + ", ruta_pdfproto=" + ruta_pdfproto + "]";
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
				Protocolizaciones nuevaProtocolizaciones = (Protocolizaciones) otro; //Instancia una casa
				if(this.getId_proto() == nuevaProtocolizaciones.getId_proto())
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
