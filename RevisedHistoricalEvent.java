public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public RevisedHistoricalEvent() {
        super();
        revisedDescription = "No revised description available.";
        citation = "No citation available.";
    }

    public RevisedHistoricalEvent(String description, Date eventDate, String revisedDescription, String citation) {
        super(description, eventDate);
        setRevisedDescription(revisedDescription);
        setCitation(citation);
    }

    public RevisedHistoricalEvent(RevisedHistoricalEvent original) {
        if (original == null) {
            revisedDescription = "No revised description available.";
            citation = "No citation available.";
        } else {
            super.setAll(original.getDescription(), original.getEventDate());
            revisedDescription = original.revisedDescription;
            citation = original.citation;
        }
    }

    public String getRevisedDescription() {
        return revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    public void setRevisedDescription(String revisedDescription) {
        if (revisedDescription == null || revisedDescription.trim().equals("")) {
            this.revisedDescription = "No revised description available.";
        } else {
            this.revisedDescription = revisedDescription;
        }
    }

    public void setCitation(String citation) {
        if (citation == null || citation.trim().equals("")) {
            this.citation = "No citation available.";
        } else {
            this.citation = citation;
        }
    }

    public void setAll(String description, Date eventDate, String revisedDescription, String citation) {
        super.setAll(description, eventDate);
        setRevisedDescription(revisedDescription);
        setCitation(citation);
    }

    public void teach() {
        System.out.println("The following  \"history\" was told for many years:");
        System.out.println();
        System.out.println(getDescription());
        System.out.println();
        System.out.println();
        System.out.println("By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.");
        System.out.println("Here is the revised history:");
        System.out.println(revisedDescription);
        System.out.println();
        System.out.println("Source: " + citation);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRevised history: " + revisedDescription
                + "\nSource: " + citation;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (!(other instanceof RevisedHistoricalEvent)) {
            return false;
        } else {
            RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;

            return super.equals(otherEvent)
                    && revisedDescription.equals(otherEvent.revisedDescription)
                    && citation.equals(otherEvent.citation);
        }
    }
}
