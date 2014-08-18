package co.wakarimasen.ceredux;

import co.wakarimasen.ceredux.imageboard.Board;

public interface ThreadNavigator {
	public void gotoPost(Board b, int threadId, int postId, boolean allowBoard, boolean scrollTo);
	public Board getBoard();
	public int getThreadId();
	public void addQuote(int id);
	public void viewImage(int id);
	public boolean isThread();
}
