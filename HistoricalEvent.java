public class HistoricalEvent {
    private String description;
    private Date eventDate;

    public HistoricalEvent() {
        description = "No description available.";
        eventDate = new Date();
    }

    public HistoricalEvent(String description, Date eventDate) {
        setDescription(description);
        setEventDate(eventDate);
    }

    public HistoricalEvent(HistoricalEvent original) {
        if (original == null) {
            description = "No description available.";
            eventDate = new Date();
        } else {
            description = original.description;
            eventDate = new Date(original.eventDate);
        }
    }

    public String getDescription() {
        return description;
    }

    public Date getEventDate() {
        return new Date(eventDate);
    }

    public void setDescription(String description) {
        if (description == null || description.trim().equals("")) {
            this.description = "No description available.";
        } else {
            this.description = description;
        }
    }

    public void setEventDate(Date eventDate) {
        if (eventDate == null) {
            this.eventDate = new Date();
        } else {
            this.eventDate = new Date(eventDate);
        }
    }

    public void setAll(String description, Date eventDate) {
        setDescription(description);
        setEventDate(eventDate);
    }

    @Override
    public String toString() {
        return "On " + eventDate + ": " + description;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (!(other instanceof HistoricalEvent)) {
            return false;
        } else {
            HistoricalEvent otherEvent = (HistoricalEvent) other;

            return description.equals(otherEvent.description)
                    && eventDate.equals(otherEvent.eventDate);
        }
    }
}
