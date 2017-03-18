package RecuperatorioParcial2.Ejercicio1;

import java.time.LocalDateTime;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class Contract {

    private SecurePolicy aPolicy;
    private LocalDateTime duracion;
    private LocalDateTime now;
    private double price;

    public Contract(SecurePolicy aPolicy ,  LocalDateTime duracion) {

            this.now = LocalDateTime.now();
            this.duracion = duracion;
            this.aPolicy = aPolicy;
    }

    public LocalDateTime getDuracion() {
        return duracion;
    }

    public double getDuracionDouble() {
        return duracion.getYear();
    }

    public double getNowDouble() {
        return now.getYear();
    }

    public LocalDateTime getNow() {
        return now;
    }

    public SecurePolicy getaPolicy() {
        return aPolicy;
    }

    public void addPolicy(SecurePolicy aPolicy) {
        this.aPolicy = aPolicy;
    }

    public void removePolicy() {
        aPolicy = null;
    }

    public void finishesPolicy() {

        for (int i = now.getDayOfYear() ; i < duracion.getDayOfYear() ; i++) {
            if (now.getDayOfYear() == duracion.getDayOfYear()) {
                aPolicy = null;
            }
        }
    }

    public boolean hasPolicy() {
        if (!(aPolicy == null)) {
            return true;
        } else throw new RuntimeException("ALREADY HAS POLICY");
    }

}
