package inheritance;

public class Doctor extends Professions {

  public Diagnose heal(Patient patient) {
    return new Diagnose();
  }
}
