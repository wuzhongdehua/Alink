package com.alibaba.alink.operator.stream.regression;

import org.apache.flink.ml.api.misc.param.Params;

import com.alibaba.alink.operator.batch.BatchOperator;
import com.alibaba.alink.operator.common.fm.FmModelMapper;
import com.alibaba.alink.operator.stream.utils.ModelMapStreamOp;
import com.alibaba.alink.params.recommendation.FmPredictParams;

/**
 * Fm regression predict stream operator. this operator predict data's label with fm model.
 */
public final class FmRegressorPredictStreamOp extends ModelMapStreamOp <FmRegressorPredictStreamOp>
	implements FmPredictParams <FmRegressorPredictStreamOp> {

	private static final long serialVersionUID = -3923538036043466470L;

	public FmRegressorPredictStreamOp(BatchOperator model) {
		this(model, new Params());
	}

	public FmRegressorPredictStreamOp(BatchOperator model, Params params) {
		super(model, FmModelMapper::new, params);
	}

}
