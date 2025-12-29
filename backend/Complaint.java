public class Complaint {

    private String description;
    private String location;
    private String status;
    private String aiCategory;
    private String aiSuggestion;

    public Complaint(String description, String location) {
        this.description = description;
        this.location = location;
        this.status = "Pending";
        this.aiCategory = "Waste"; // Mock AI output
        this.aiSuggestion = "Forwarded to concerned department";
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public String getAiCategory() {
        return aiCategory;
    }

    public String getAiSuggestion() {
        return aiSuggestion;
    }
}
