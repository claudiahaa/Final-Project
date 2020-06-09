package com.project.bit.approval.service;

import com.project.bit.approval.domain.ApproverVO;

import java.util.List;

public interface ApprovalService {

    //결재 작성시 결재선 정보 셋팅
    public List<ApproverVO> getApproverList(String apFormNo, String userId);

    //결재자 정보 등록하기
    public int postApprovers(List<ApproverVO> approvers, Long apDocNo);
    
}
