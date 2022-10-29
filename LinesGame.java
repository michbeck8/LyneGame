package hw3;

import java.util.ArrayList;

import api.GridCell;
import api.Line;
import api.Location;
import api.StringUtil;

/**
 * Game state for a Lines game.
 */
public class LinesGame
{
  
  /**
   * Constructs a LinesGame from the given grid and Line list.
   * This constructor does not do any error-checking to ensure
   * that the grid and the Line array are consistent. Initially
   * the current line is null.
   * @param givenGrid
   *   a 2d array of GridCell
   * @param givenLines
   *   list of Line objects
   */
  public LinesGame(GridCell[][] givenGrid, ArrayList<Line> givenLines)
  {
    // TODO
	  
  }
  
  /**
   * Constructs a LinesGame from the given descriptor. Initially the
   * current line is null.
   * @param descriptor
   *   array of strings representing initial state
   */
  
  //this constructor is dependent on util.checkForLineSegment and util.checkForPotentilaMatch
  
  public LinesGame(String[] descriptor)
  {
    // TODO
  }
  
  /**
   * Returns the number of columns for this game.
   * @return
   *  width for this game
   */ 
  public int getWidth()
  {
    // TODO
    return 0;
  }
  
  /**
   * Returns the number of rows for this game.
   * @return
   *   height for this game
   */ 
  public int getHeight()
  {
    // TODO
    return 0;
  }
  
  /**
   * Returns the current cell for this game, possibly null.
   * The current cell is just the last location, if any, 
   * in the current line, if there is one. Returns null
   * if the current line is null or if the current line
   * has an empty list of locations.
   * @return
   *   current cell for this game, or null
   *   
   */
  public Location getCurrentLocation()
  {
    // TODO
    return null;
  }
  
  /**
   * Returns the id for the current line, or -1
   * if the current line is null.
   * @return
   *   id for the current line
   */
  public int getCurrentId()
  {
    // TODO
    return 0;
  }
  
  /**
   * Return this game's current line (which may be null).
   * @return
   *   current line for this game
   */
  public Line getCurrentLine()
  {
    // TODO
    return null;
  }
  
  /**
   * Returns a reference to this game's grid.  Clients should
   * not modify the array.
   * @return
   *   the game grid
   */
  public GridCell[][] getGrid()
  {
    // TODO
    return null;
  }
  
  /**
   * Returns the grid cell at the given position.
   * @param row
   *   given row
   * @param col
   *   given column
   * @return
   *   grid cell at (row, col)
   */
  public GridCell getCell(int row, int col)
  {
    // TODO
    return null;
  }
  
  /**
   * Returns all Lines for this game.  Clients should not modify
   * the returned list or the Line objects.
   * @return
   *   list of lines for this game
   */ 
  public ArrayList<Line> getAllLines()
  {
    // TODO
    return null;
  }
  
  /**
   * Returns the total number of moves.  A "move" means that a 
   * new Location was successfully added to the current line
   * in addCell.
   * @return
   *   total number of moves so far in this game
   */
  public int getMoveCount()
  {
    // TODO
    return 0;
  }
  
  /**
   * Returns true if all lines are connected and all
   * cells are at their maximum count.
   * @return
   *   true if all lines are complete and all cells are at max
   */ 
  public boolean isComplete()
  {
    // TODO
    return false;
  }
  
  /**
   * Attempts to set the current line based on the given
   * row and column.  When using a GUI, this method is typically 
   * invoked when the mouse is pressed. If the current line is 
   * already non-null, this method does nothing.
   * There are two possibilities:
   * <ul>
   *   <li>Any endpoint can be selected.  Selecting an 
   *   endpoint clears the line associated with that endpoint's id,
   *   and all cells that were previously included in the line are decremented.
   *   The line then becomes the current line, and the endpoint is incremented
   *   and placed on the line's list of locations as its only element.
   *   <li>A non-endpoint cell can be selected if it is not a crossing
   *   and if it is the last cell in some line.  That line then becomes
   *   the current line.
   * </ul>
   * If neither of the above conditions is met, or if the
   * current line is non-null, this method does nothing.
   * 
   * @param row
   *   given row
   * @param col
   *   given column
   */
  public void startLine(int row, int col)
  {
    // TODO
  }
  
  /**
   * Sets the current line to null. When using a GUI, this method is 
   * typically invoked when the mouse is released.
   */
  public void endLine()
  {
    // TODO
  }
  
  /**
   * Attempts to add a new cell to the current line.  
   * When using a GUI, this method is typically invoked when the mouse is 
   * dragged.  In order to add a cell, the following conditions must be satisfied.
   * Here the "current cell" is the last cell in the current line, and "new cell"
   * is the cell at the given row and column:
   * :
   * <ol>
   *   <li>The current line is non-null
   *   <li>The current line is not connected
   *   <li>The given row and column are adjacent to the location of the current cell
   *       (horizontally, vertically, or diagonally) and not the same as the current cell
   *   <li>The count for the new cell is less than its max count
   *   <li>If the new cell is a MIDDLE or ENDPOINT, then its id matches
   *   the id for the current line
   *   <li>Adding the new cell will not cause the line to re-trace any
   *   existing line (according to the result of Util.checkForLineSegment)
   *   <li>Adding the new cell to the line would not cross any existing line
   *   (according to the result of Util.checkForPotentialCrossing)
   * </ol>
   * If the above conditions are met, a new Location at (row, col) is added
   * to the current line and the cell count is incremented.  Otherwise, the 
   * method does nothing.  If a new location
   * is added to the current line, the move counter is increased by 1.
   * @param row
   *   given row for the new cell
   * @param col
   *   given column for the new cell
   */
  public void addCell(int row, int col)
  {
    // TODO
  }
  

  /**
   * Returns a string representation of this game.
   */
  public String toString()
  {
    String result = "";
    result += "-----\n";
    result += StringUtil.originalGridToString(getGrid());
    result += "-----\n";
    result += StringUtil.currentGridToString(getGrid(), getAllLines());
    result += "-----\n";
    result += StringUtil.allLinesToString(getAllLines());
    Line ln = getCurrentLine();
    if (ln != null)
    {
      result += "Current line: " + ln.getId() + "\n";
    }
    else
    {
      result += "Current line: null\n";
    }
    return result;
  }

}
