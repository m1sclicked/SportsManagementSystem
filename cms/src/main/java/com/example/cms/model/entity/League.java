package com.example.cms.model.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "leagues")
public class League {

    @Id
    private String leagueID;

    @NotEmpty
    private String leagueName;

    @NotEmpty
    private String leagueSport;

    @NotEmpty
    private String leagueGender;

    @OneToMany(mappedBy = "league")
    private List<Team> teams = new ArrayList<>();
}

