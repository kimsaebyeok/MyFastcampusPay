package org.fastcampuspay.membership.application.port.in;

import org.fastcampuspay.membership.common.UseCase;
import org.fastcampuspay.membership.domain.Membership;

@UseCase
public interface FindMembershipUseCase {
    Membership findMembership(FindMembershipCommand command);

}
