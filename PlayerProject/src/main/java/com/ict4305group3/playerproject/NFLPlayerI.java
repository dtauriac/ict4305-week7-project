/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.playerproject;

/**
 * 
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Tauriac
 * @author Kevin Taylor
 */

public class NFLPlayerI implements Player {

  String name;
  int stats;
  String sport;

  public NFLPlayerI(String name, int stats) {
	this.name = name;
	this.stats = stats;
	this.sport = "NFL";
  }

  public String getName() {
	return name;
  }

  public int getStats() {
	return stats;
  }

  public String getSport() {
	return sport;
  }
}