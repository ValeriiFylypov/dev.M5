package jdbc_update.entities;

import lombok.Data;

@Data
public class Project {
    private int clientId;
    private String startDate;
    private String finishDate;
}
