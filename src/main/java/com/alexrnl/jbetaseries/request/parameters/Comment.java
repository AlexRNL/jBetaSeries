package com.alexrnl.jbetaseries.request.parameters;

/**
 * Parameter which allow to set a comment to post.<br />
 * @author Alex
 */
public class Comment extends Parameter<String> {
	/** Name of the comment parameter */
	public static final String	PARAMETER_COMMENT	= "comments";
	
	/**
	 * Constructor #1.<br />
	 * @param comment
	 *        the comment to post.
	 */
	public Comment (final String comment) {
		super(PARAMETER_COMMENT, comment);
	}
}
