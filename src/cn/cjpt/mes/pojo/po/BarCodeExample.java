package cn.cjpt.mes.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class BarCodeExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BarCodeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("ID like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("ID not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberIsNull() {
			addCriterion("BARCODENUMBER is null");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberIsNotNull() {
			addCriterion("BARCODENUMBER is not null");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberEqualTo(String value) {
			addCriterion("BARCODENUMBER =", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberNotEqualTo(String value) {
			addCriterion("BARCODENUMBER <>", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberGreaterThan(String value) {
			addCriterion("BARCODENUMBER >", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberGreaterThanOrEqualTo(String value) {
			addCriterion("BARCODENUMBER >=", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberLessThan(String value) {
			addCriterion("BARCODENUMBER <", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberLessThanOrEqualTo(String value) {
			addCriterion("BARCODENUMBER <=", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberLike(String value) {
			addCriterion("BARCODENUMBER like", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberNotLike(String value) {
			addCriterion("BARCODENUMBER not like", value, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberIn(List<String> values) {
			addCriterion("BARCODENUMBER in", values, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberNotIn(List<String> values) {
			addCriterion("BARCODENUMBER not in", values, "barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberBetween(String value1, String value2) {
			addCriterion("BARCODENUMBER between", value1, value2,
					"barcodenumber");
			return (Criteria) this;
		}

		public Criteria andBarcodenumberNotBetween(String value1, String value2) {
			addCriterion("BARCODENUMBER not between", value1, value2,
					"barcodenumber");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andTypesIsNull() {
			addCriterion("TYPES is null");
			return (Criteria) this;
		}

		public Criteria andTypesIsNotNull() {
			addCriterion("TYPES is not null");
			return (Criteria) this;
		}

		public Criteria andTypesEqualTo(String value) {
			addCriterion("TYPES =", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesNotEqualTo(String value) {
			addCriterion("TYPES <>", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesGreaterThan(String value) {
			addCriterion("TYPES >", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesGreaterThanOrEqualTo(String value) {
			addCriterion("TYPES >=", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesLessThan(String value) {
			addCriterion("TYPES <", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesLessThanOrEqualTo(String value) {
			addCriterion("TYPES <=", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesLike(String value) {
			addCriterion("TYPES like", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesNotLike(String value) {
			addCriterion("TYPES not like", value, "types");
			return (Criteria) this;
		}

		public Criteria andTypesIn(List<String> values) {
			addCriterion("TYPES in", values, "types");
			return (Criteria) this;
		}

		public Criteria andTypesNotIn(List<String> values) {
			addCriterion("TYPES not in", values, "types");
			return (Criteria) this;
		}

		public Criteria andTypesBetween(String value1, String value2) {
			addCriterion("TYPES between", value1, value2, "types");
			return (Criteria) this;
		}

		public Criteria andTypesNotBetween(String value1, String value2) {
			addCriterion("TYPES not between", value1, value2, "types");
			return (Criteria) this;
		}

		public Criteria andCabinettypeIsNull() {
			addCriterion("CABINETTYPE is null");
			return (Criteria) this;
		}

		public Criteria andCabinettypeIsNotNull() {
			addCriterion("CABINETTYPE is not null");
			return (Criteria) this;
		}

		public Criteria andCabinettypeEqualTo(String value) {
			addCriterion("CABINETTYPE =", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeNotEqualTo(String value) {
			addCriterion("CABINETTYPE <>", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeGreaterThan(String value) {
			addCriterion("CABINETTYPE >", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeGreaterThanOrEqualTo(String value) {
			addCriterion("CABINETTYPE >=", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeLessThan(String value) {
			addCriterion("CABINETTYPE <", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeLessThanOrEqualTo(String value) {
			addCriterion("CABINETTYPE <=", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeLike(String value) {
			addCriterion("CABINETTYPE like", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeNotLike(String value) {
			addCriterion("CABINETTYPE not like", value, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeIn(List<String> values) {
			addCriterion("CABINETTYPE in", values, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeNotIn(List<String> values) {
			addCriterion("CABINETTYPE not in", values, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeBetween(String value1, String value2) {
			addCriterion("CABINETTYPE between", value1, value2, "cabinettype");
			return (Criteria) this;
		}

		public Criteria andCabinettypeNotBetween(String value1, String value2) {
			addCriterion("CABINETTYPE not between", value1, value2,
					"cabinettype");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNull() {
			addCriterion("CREATETIME is null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNotNull() {
			addCriterion("CREATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeEqualTo(String value) {
			addCriterion("CREATETIME =", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotEqualTo(String value) {
			addCriterion("CREATETIME <>", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThan(String value) {
			addCriterion("CREATETIME >", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
			addCriterion("CREATETIME >=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThan(String value) {
			addCriterion("CREATETIME <", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThanOrEqualTo(String value) {
			addCriterion("CREATETIME <=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLike(String value) {
			addCriterion("CREATETIME like", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotLike(String value) {
			addCriterion("CREATETIME not like", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIn(List<String> values) {
			addCriterion("CREATETIME in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotIn(List<String> values) {
			addCriterion("CREATETIME not in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeBetween(String value1, String value2) {
			addCriterion("CREATETIME between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotBetween(String value1, String value2) {
			addCriterion("CREATETIME not between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andOperatornameIsNull() {
			addCriterion("OPERATORNAME is null");
			return (Criteria) this;
		}

		public Criteria andOperatornameIsNotNull() {
			addCriterion("OPERATORNAME is not null");
			return (Criteria) this;
		}

		public Criteria andOperatornameEqualTo(String value) {
			addCriterion("OPERATORNAME =", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameNotEqualTo(String value) {
			addCriterion("OPERATORNAME <>", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameGreaterThan(String value) {
			addCriterion("OPERATORNAME >", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
			addCriterion("OPERATORNAME >=", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameLessThan(String value) {
			addCriterion("OPERATORNAME <", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameLessThanOrEqualTo(String value) {
			addCriterion("OPERATORNAME <=", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameLike(String value) {
			addCriterion("OPERATORNAME like", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameNotLike(String value) {
			addCriterion("OPERATORNAME not like", value, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameIn(List<String> values) {
			addCriterion("OPERATORNAME in", values, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameNotIn(List<String> values) {
			addCriterion("OPERATORNAME not in", values, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameBetween(String value1, String value2) {
			addCriterion("OPERATORNAME between", value1, value2, "operatorname");
			return (Criteria) this;
		}

		public Criteria andOperatornameNotBetween(String value1, String value2) {
			addCriterion("OPERATORNAME not between", value1, value2,
					"operatorname");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}