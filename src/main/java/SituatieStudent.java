import java.util.List;

public class SituatieStudent {
    private String numeStudent;
    private List<Integer> note;

    public SituatieStudent(String numeStudent, List<Integer> note) {
        this.numeStudent = numeStudent;
        this.note = note;
    }

    public String getNumeStudent() {
        return numeStudent;
    }

    public void setNumeStudent(String numeStudent) {
        this.numeStudent = numeStudent;
    }

    public List<Integer> getNote() {
        return note;
    }

    public void setNote(List<Integer> note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "SituatieStudent{" +
                "numeStudent='" + numeStudent + '\'' +
                ", note=" + note +
                '}';
    }

    public double calculMedie() {
        return note.stream().mapToDouble(x -> x).average().orElse(Double.NaN);
    }

    public boolean eIntegralist() {
        return note.stream().allMatch(x -> x >= 5);
    }

    public boolean areBursa() { return calculMedie() >= 9; }
}
