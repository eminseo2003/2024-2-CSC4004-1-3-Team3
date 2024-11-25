package auction.back.dto.response;

import auction.back.domain.Auction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@Builder
public class IngAuctionResponseDto {
    private Long id;
    private String startPrice;
    private String ingPrice;
    private String endPrice;
    private LocalDateTime startAt;

    public static IngAuctionResponseDto of(Auction auction) {
        return IngAuctionResponseDto.builder()
                .id(auction.getId())
                .startPrice(auction.getStartPrice())
                .ingPrice(auction.getIngPrice())
                .endPrice(auction.getEndPrice())
                .startAt(auction.getStartAt())
                .build();
    }
}