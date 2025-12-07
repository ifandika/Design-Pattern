public class MelonLazy {
		private static volatile MelonLazy melonLazy = null;
		
		private MelonLazy() {}
		
		public static MelonLazy getInstance() {
			if(melonLazy == null) {
				synchronized(MelonLazy.class) {
					if(melonLazy == null) {
						melonLazy = new MelonLazy();
					}
				}
			}
			return melonLazy;
		}
	}