public enum RoomType {

        SINGLE(1),
        DOUBLE(2),
        FAMILY(6);

        private int roomType;

        RoomType(int roomType) {
            this.roomType = roomType;
        }

        public int getRoomType() {
            return roomType;
        }
    }

