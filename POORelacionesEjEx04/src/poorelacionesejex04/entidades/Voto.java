package poorelacionesejex04.entidades;

/**
 * Clase Voto, esta clase tendrá como atributos, un objeto Alumno que será el 
 * alumno que vota y una lista de los alumnos a los que votó.
 *
 * @author Eduardo
 */
public class Voto {
    
    private Alumno alumnoVoto;
    private Alumno voto1Alumno;
    private Alumno voto2Alumno;
    private Alumno voto3Alumno;

    public Voto() {
    }
    public Voto(Alumno alumnoVoto, Alumno voto1Alumno, Alumno voto2Alumno, Alumno voto3Alumno) {
        this.alumnoVoto = alumnoVoto;
        this.voto1Alumno = voto1Alumno;
        this.voto2Alumno = voto2Alumno;
        this.voto3Alumno = voto3Alumno;
    }

    public Alumno getAlumnoVoto() {
        return alumnoVoto;
    }
    public void setAlumnoVoto(Alumno alumnoVoto) {
        this.alumnoVoto = alumnoVoto;
    }
    public Alumno getVoto1Alumno() {
        return voto1Alumno;
    }
    public void setVoto1Alumno(Alumno voto1Alumno) {
        this.voto1Alumno = voto1Alumno;
    }
    public Alumno getVoto2Alumno() {
        return voto2Alumno;
    }
    public void setVoto2Alumno(Alumno voto2Alumno) {
        this.voto2Alumno = voto2Alumno;
    }
    public Alumno getVoto3Alumno() {
        return voto3Alumno;
    }
    public void setVoto3Alumno(Alumno voto3Alumno) {
        this.voto3Alumno = voto3Alumno;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoVoto=" + alumnoVoto + ", voto1Alumno=" + voto1Alumno + ", voto2Alumno=" + voto2Alumno + ", voto3Alumno=" + voto3Alumno + '}';
    }
    
    

    
}
