public class ComplaintService {

    public static void main(String[] args) {

        Complaint complaint = new Complaint(
                "Garbage not collected near my house",
                "Gachibowli"
        );

        System.out.println("Complaint Received");
        System.out.println("Description: " + complaint.getDescription());
        System.out.println("Location: " + complaint.getLocation());
        System.out.println("AI Category: " + complaint.getAiCategory());
        System.out.println("AI Suggestion: " + complaint.getAiSuggestion());
        System.out.println("Status: " + complaint.getStatus());
    }
}
