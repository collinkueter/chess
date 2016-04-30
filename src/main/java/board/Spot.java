package board;

import pieces.Piece;

public class Spot {

    private Piece piece;
    private Location location;

    public Spot(SpotBuilder builder) {
        this.piece = builder.bPiece;
        this.location = builder.bLocation;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static class SpotBuilder {
        private Piece   bPiece;
        private Location bLocation;

        public SpotBuilder withPiece(Piece piece) {
            this.bPiece = piece;
            return this;
        }

        public SpotBuilder withLocation(Location location) {
            this.bLocation = location;
            return this;
        }

        public SpotBuilder withLocationValues(int x, int y) {
            this.bLocation = new Location(x, y);
            return this;
        }

        public Spot Build() {
            return new Spot(this);
        }
    }
}
