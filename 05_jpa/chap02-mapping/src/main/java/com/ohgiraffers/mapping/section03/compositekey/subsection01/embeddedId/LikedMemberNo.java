package com.ohgiraffers.mapping.section03.compositekey.subsection01.embeddedId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LikedMemberNo {

    @Column(name = "liked_member_no")
    private int likedMemberNo;

    protected LikedMemberNo() {}

    public LikedMemberNo(int likedMemberNo) {
        this.likedMemberNo = likedMemberNo;
    }

    public int getLikedMemberNo() {
        return likedMemberNo;
    }

    @Override
    public String toString() {
        return "LikedMemberNo{" +
                "likedMemberNo=" + likedMemberNo +
                '}';
    }
}
