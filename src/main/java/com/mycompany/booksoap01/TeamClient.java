/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booksoap01;

import java.util.List;
import teamsC.Player;
import teamsC.Team;
import teamsC.Teams;
import teamsC.TeamsService;

/**
 *
 * @author BRBLAVE
 */
public class TeamClient {
    public static void main(String[ ] args) {
        TeamsService service = new TeamsService();
        Teams port = service.getTeamsPort();
        List<Team> teams = port.getTeams();
        for (Team team : teams) {
            System.out.println("Team name: " + team.getName() +
                               " (roster count: " + team.getRosterCount() + ")");
            for (Player player : team.getPlayers()) {
                System.out.println("  Player: " + player.getNickname());
                System.out.println("  Name: " + player.getName() );
            }
        }
    }
}
