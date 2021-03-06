package eu.adlogix.com.google.api.ads.dfp;

import lombok.Getter;

public enum StatementCondition {

	LESS("<"), LESS_OR_EQUAL("<="), GREATER(">"), GREATER_OR_EQUAL(">="), EQUAL("="), NOT_EQUAL("!="), IN("IN");

	@Getter
	private String operator;

	private StatementCondition(final String operator) {
		this.operator = operator;
	}
}
