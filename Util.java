package hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import api.GridCell;
import api.Line;
import api.Location;
import api.StringUtil;

/**
 * Utility class with methods to help initializing a Lines game from 
 * a string descriptor, and for creating a collection of games from
 * a file containing descriptors.
 */

public class Util
{

  
  /**
   * Given a 2d array of GridCell, constructs an array of Line
   * objects based on the information in the grid.  Specifically,
   * for each pair of endpoints with matching ids, a corresponding
   * Line object is constructed with that id and with the given endpoints.
   * The order of the endpoints (endpoint 0 vs endpoint 1) is unspecified.
   * If there are more than two endpoints with the same id, or if there
   * is only one endpoint with the given id, this
   * method returns null. No other error-checking is performed (e.g. there
   * may be middle cells with no matching endpoint, or the game
   * may be unsolvable for other reasons).
   * <p>
   * Note that in general the id for a Line will <em>not</em> be the
   * same as its index in the returned array.
   * @param grid
   *   a 2d array of GridCell
   * @return
   *   array of Line objects based on the grid information
   */
  public static ArrayList<Line> createLinesFromGrid(GridCell[][] grid)
  {
    // TODO
    return null;
  }
  
  /**
   * Reads the given file and constructs a list of LinesGame objects, one for
   * each descriptor in the file.  Descriptors in the file are separated by one or more
   * blank lines, where a "blank line" consists of some amount of whitespace and a 
   * newline character. The file may have extra whitespace at the beginning, 
   * and it must always end with one or more blank lines. Invalid descriptors
   * are ignored, so the method may return an empty list.  (A descriptor is "invalid"
   * if either createGridFromStringArray returns null, or createLinesFromGrid
   * returns null.)
   * @param filename
   *   name of the file to read
   * @return
   *   list of LinesGame objects created from the valid descriptors in the file
   * @throws FileNotFoundException
   *   if a file with the given name can't be opened
   */ 
  public static ArrayList<LinesGame> readFile(String filename) throws FileNotFoundException
  {
    // TODO
    return null;
  }
  

  
  /**
   * Determines whether a line between two diagonally adjacent locations
   * would cross any existing line in the given list.
   * The check is based on the following test:
   * <ul>
   *  <li>Let (rOld, cOld) denote the current cell location and let (rNew, cNew) denote
   * the new cell location.  
   *  <li>Let rDiff = rNew - rOld and cDiff = cNew - cOld.
   *  <li>If either rDiff or cDiff does not have absolute value 1, then
   *  the two positions are not diagonally adjacent and the method returns false
   *  <li>If the two positions are diagonally adjacent, then p0 = (rOld, cOld + cDiff) 
   *  and p1 = (rOld + rDiff, cOld) always form the opposite diagonal (i.e., the 
   *  line that could potentially be crossed).
   *  <li>The method returns true if p0 and p1 occur consecutively, in either order,
   *  in any existing line in the given array.
   * </ul>
   * 
   * @param lines
   *   list of Line objects
   * @param currentLoc
   *   any Location
   * @param newLoc
   *   any Location
   * @return
   *   true if the two locations are diagonally adjacent and some
   *   existing line crosses the opposite diagonal
   */
  public static boolean checkForPotentialCrossing(ArrayList<Line> lines, Location currentLoc, Location newLoc)
  {
    // TODO
    return false;
  }
  
  /**
   * Determines whether any line in the given array already contains the segment between 
   * the given locations; that is, whether the two given locations occur consecutively,
   * in either order, in any of the given lines.
   * @param lines 
   *   any array of lines
   * @param currentLoc
   *   any position object
   * @param newLoc
   *   any position object
   * @return
   *   true if the two locations occur consecutively in some line
   */
  public static boolean checkForLineSegment(ArrayList<Line> lines, Location currentLoc, Location newLoc)
  {
    // TODO
    return false;
  }
  
}
