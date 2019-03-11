package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class mineralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public mineralExample() {
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andJieliIsNull() {
            addCriterion("jieli is null");
            return (Criteria) this;
        }

        public Criteria andJieliIsNotNull() {
            addCriterion("jieli is not null");
            return (Criteria) this;
        }

        public Criteria andJieliEqualTo(String value) {
            addCriterion("jieli =", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliNotEqualTo(String value) {
            addCriterion("jieli <>", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliGreaterThan(String value) {
            addCriterion("jieli >", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliGreaterThanOrEqualTo(String value) {
            addCriterion("jieli >=", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliLessThan(String value) {
            addCriterion("jieli <", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliLessThanOrEqualTo(String value) {
            addCriterion("jieli <=", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliLike(String value) {
            addCriterion("jieli like", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliNotLike(String value) {
            addCriterion("jieli not like", value, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliIn(List<String> values) {
            addCriterion("jieli in", values, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliNotIn(List<String> values) {
            addCriterion("jieli not in", values, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliBetween(String value1, String value2) {
            addCriterion("jieli between", value1, value2, "jieli");
            return (Criteria) this;
        }

        public Criteria andJieliNotBetween(String value1, String value2) {
            addCriterion("jieli not between", value1, value2, "jieli");
            return (Criteria) this;
        }

        public Criteria andTuqiIsNull() {
            addCriterion("tuqi is null");
            return (Criteria) this;
        }

        public Criteria andTuqiIsNotNull() {
            addCriterion("tuqi is not null");
            return (Criteria) this;
        }

        public Criteria andTuqiEqualTo(String value) {
            addCriterion("tuqi =", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiNotEqualTo(String value) {
            addCriterion("tuqi <>", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiGreaterThan(String value) {
            addCriterion("tuqi >", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiGreaterThanOrEqualTo(String value) {
            addCriterion("tuqi >=", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiLessThan(String value) {
            addCriterion("tuqi <", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiLessThanOrEqualTo(String value) {
            addCriterion("tuqi <=", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiLike(String value) {
            addCriterion("tuqi like", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiNotLike(String value) {
            addCriterion("tuqi not like", value, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiIn(List<String> values) {
            addCriterion("tuqi in", values, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiNotIn(List<String> values) {
            addCriterion("tuqi not in", values, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiBetween(String value1, String value2) {
            addCriterion("tuqi between", value1, value2, "tuqi");
            return (Criteria) this;
        }

        public Criteria andTuqiNotBetween(String value1, String value2) {
            addCriterion("tuqi not between", value1, value2, "tuqi");
            return (Criteria) this;
        }

        public Criteria andColorgansheIsNull() {
            addCriterion("colorganshe is null");
            return (Criteria) this;
        }

        public Criteria andColorgansheIsNotNull() {
            addCriterion("colorganshe is not null");
            return (Criteria) this;
        }

        public Criteria andColorgansheEqualTo(String value) {
            addCriterion("colorganshe =", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheNotEqualTo(String value) {
            addCriterion("colorganshe <>", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheGreaterThan(String value) {
            addCriterion("colorganshe >", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheGreaterThanOrEqualTo(String value) {
            addCriterion("colorganshe >=", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheLessThan(String value) {
            addCriterion("colorganshe <", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheLessThanOrEqualTo(String value) {
            addCriterion("colorganshe <=", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheLike(String value) {
            addCriterion("colorganshe like", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheNotLike(String value) {
            addCriterion("colorganshe not like", value, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheIn(List<String> values) {
            addCriterion("colorganshe in", values, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheNotIn(List<String> values) {
            addCriterion("colorganshe not in", values, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheBetween(String value1, String value2) {
            addCriterion("colorganshe between", value1, value2, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andColorgansheNotBetween(String value1, String value2) {
            addCriterion("colorganshe not between", value1, value2, "colorganshe");
            return (Criteria) this;
        }

        public Criteria andXiaoguangIsNull() {
            addCriterion("xiaoguang is null");
            return (Criteria) this;
        }

        public Criteria andXiaoguangIsNotNull() {
            addCriterion("xiaoguang is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoguangEqualTo(String value) {
            addCriterion("xiaoguang =", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangNotEqualTo(String value) {
            addCriterion("xiaoguang <>", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangGreaterThan(String value) {
            addCriterion("xiaoguang >", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangGreaterThanOrEqualTo(String value) {
            addCriterion("xiaoguang >=", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangLessThan(String value) {
            addCriterion("xiaoguang <", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangLessThanOrEqualTo(String value) {
            addCriterion("xiaoguang <=", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangLike(String value) {
            addCriterion("xiaoguang like", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangNotLike(String value) {
            addCriterion("xiaoguang not like", value, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangIn(List<String> values) {
            addCriterion("xiaoguang in", values, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangNotIn(List<String> values) {
            addCriterion("xiaoguang not in", values, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangBetween(String value1, String value2) {
            addCriterion("xiaoguang between", value1, value2, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andXiaoguangNotBetween(String value1, String value2) {
            addCriterion("xiaoguang not between", value1, value2, "xiaoguang");
            return (Criteria) this;
        }

        public Criteria andShuangjingIsNull() {
            addCriterion("shuangjing is null");
            return (Criteria) this;
        }

        public Criteria andShuangjingIsNotNull() {
            addCriterion("shuangjing is not null");
            return (Criteria) this;
        }

        public Criteria andShuangjingEqualTo(String value) {
            addCriterion("shuangjing =", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingNotEqualTo(String value) {
            addCriterion("shuangjing <>", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingGreaterThan(String value) {
            addCriterion("shuangjing >", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingGreaterThanOrEqualTo(String value) {
            addCriterion("shuangjing >=", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingLessThan(String value) {
            addCriterion("shuangjing <", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingLessThanOrEqualTo(String value) {
            addCriterion("shuangjing <=", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingLike(String value) {
            addCriterion("shuangjing like", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingNotLike(String value) {
            addCriterion("shuangjing not like", value, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingIn(List<String> values) {
            addCriterion("shuangjing in", values, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingNotIn(List<String> values) {
            addCriterion("shuangjing not in", values, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingBetween(String value1, String value2) {
            addCriterion("shuangjing between", value1, value2, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andShuangjingNotBetween(String value1, String value2) {
            addCriterion("shuangjing not between", value1, value2, "shuangjing");
            return (Criteria) this;
        }

        public Criteria andGuangxingIsNull() {
            addCriterion("guangxing is null");
            return (Criteria) this;
        }

        public Criteria andGuangxingIsNotNull() {
            addCriterion("guangxing is not null");
            return (Criteria) this;
        }

        public Criteria andGuangxingEqualTo(String value) {
            addCriterion("guangxing =", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingNotEqualTo(String value) {
            addCriterion("guangxing <>", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingGreaterThan(String value) {
            addCriterion("guangxing >", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingGreaterThanOrEqualTo(String value) {
            addCriterion("guangxing >=", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingLessThan(String value) {
            addCriterion("guangxing <", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingLessThanOrEqualTo(String value) {
            addCriterion("guangxing <=", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingLike(String value) {
            addCriterion("guangxing like", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingNotLike(String value) {
            addCriterion("guangxing not like", value, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingIn(List<String> values) {
            addCriterion("guangxing in", values, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingNotIn(List<String> values) {
            addCriterion("guangxing not in", values, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingBetween(String value1, String value2) {
            addCriterion("guangxing between", value1, value2, "guangxing");
            return (Criteria) this;
        }

        public Criteria andGuangxingNotBetween(String value1, String value2) {
            addCriterion("guangxing not between", value1, value2, "guangxing");
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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