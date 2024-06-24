// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldad extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modeldad() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(10, 27).addBox(-4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(26, 22).addBox(-4.0F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(7, 24).addBox(2.0F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(23, 16).addBox(2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 9).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 20).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(17, 22).addBox(-3.0F, -5.0F, -2.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(22, 9).addBox(1.0F, -5.0F, -2.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -1.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(19, 20).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(24, 0).addBox(-7.0F, -7.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 24).addBox(5.0F, -7.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(24, 6).addBox(-3.0F, -6.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 11).addBox(1.0F, -6.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 9).addBox(1.0F, -6.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 4).addBox(-5.0F, -7.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(4.0F, -7.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}