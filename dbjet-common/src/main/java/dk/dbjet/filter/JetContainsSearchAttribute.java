package dk.dbjet.filter;

public final class JetContainsSearchAttribute extends JetSearchAttribute {
	
	private static String CONDITION_PATTERN = "%s LIKE '%%%s%%'";
		
	public JetContainsSearchAttribute(String column, Object value) {
		super(column, value);
	}
		
	@Override
	public String toClauseString() {
		return String.format(CONDITION_PATTERN, this.columnName, this.columnValue);
	}
}
