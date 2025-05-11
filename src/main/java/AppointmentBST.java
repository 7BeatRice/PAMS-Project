
import java.util.Comparator;
public class AppointmentBST {
    private AppointmentNode root;

    public AppointmentBST() {
        root = null;
    }

    public void addAppointment(PatientAppointment appointment) {
        root = insertRec(root, appointment);
    }

    private AppointmentNode insertRec(AppointmentNode root, PatientAppointment appointment) {
        // TODO: Implement logic to insert by appointment time (avoid duplicates)

            if (root == null){
                return new AppointmentNode(appointment);
            }
        Comparator<PatientAppointment> comparator = (a, b) ->
                a.getAppointmentTime().compareTo(b.getAppointmentTime());
        if (comparator.compare(root.data, appointment) > 0) {
                root.left = insertRec(root.left, appointment);
            }
            else if (comparator.compare(root.data, appointment) < 0){
                root.right = insertRec(root.right, appointment);
            }
            else {
                System.out.println("Duplicate not allowed: " + appointment);
            }

        return root;
    }

    public void inOrderTraversal(AppointmentNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public AppointmentNode getRoot() {
        return root;
    }
}
